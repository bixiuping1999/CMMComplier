package main;

import main.lexer.Error;
import main.lexer.Lexer;
import main.lexer.Token;
import main.parse.Parse;
import main.parse.TreeNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class T {

    public static void main(String[] args){

        String filePath="D:\\test.txt";
        File file = new File(filePath);
        Lexer lexer = new Lexer();

        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"gbk");

            BufferedReader br = new BufferedReader(reader);
            int lineNum =1;
            String line="";
            while ( (line=br.readLine())!=null){
                System.out.println(line);
                lexer.analyze(line,lineNum);
                ++lineNum;
            }

            ArrayList<Token> tokens = lexer.getTokens();
            for (int j=0;j<tokens.size();j++){
                System.out.println(tokens.get(j).toString());
            }
            if (lexer.getErrors().size()>0){
                ArrayList<Error> errors = lexer.getErrors();
                for (int i=0;i<errors.size();i++){
                    System.out.println(errors.get(i).toString());
                }
            }
            int i = 0;
            Parse parse = new Parse(tokens);


            TreeNode root = parse.runParse();
            JFrame treeFrame=new TreeFrame(root);
            treeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            treeFrame.setVisible(true);
//            System.out.println(root);
//            while (root.getChildAt(i)!=null){
//                System.out.println(root);
//                root=root.getChildAt(i);
//                i++;
//            }

            } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
