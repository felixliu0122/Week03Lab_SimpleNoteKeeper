package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        ArrayList line;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            line = new ArrayList();
            String string;
            while ((string = br.readLine()) != null) {
                line.add(string);
            }
        }
        
        Note note = new Note(line.get(0).toString(), line.get(1).toString());
        request.setAttribute("Note", note);
        
        String edit = request.getParameter("edit");
        
        if (edit == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            String title = request.getParameter("title");
            String contents = request.getParameter("contents");
            
            Note note = new Note(title, contents);
            request.setAttribute("Note", note);
            
            pw.write(title + "\n" + contents);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
