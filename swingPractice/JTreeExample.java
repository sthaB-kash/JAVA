/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPractice;

import javax.swing.*;

import javax.swing.tree.DefaultMutableTreeNode;
class JTreeExample {
    JFrame f;
    JTreeExample(){
        f=new JFrame();

        DefaultMutableTreeNode college=new DefaultMutableTreeNode("Kantipur City College");

        DefaultMutableTreeNode academic =new DefaultMutableTreeNode("Academic");

        DefaultMutableTreeNode underGraduate=new DefaultMutableTreeNode("Under Graduate");
        DefaultMutableTreeNode bca=new DefaultMutableTreeNode("BCA");
        DefaultMutableTreeNode bit=new DefaultMutableTreeNode("BIT");
        DefaultMutableTreeNode be=new DefaultMutableTreeNode("BE COMPUTER");
        DefaultMutableTreeNode graduate=new DefaultMutableTreeNode("Graduate");
        DefaultMutableTreeNode mca=new DefaultMutableTreeNode("MCA");
        DefaultMutableTreeNode mamcj=new DefaultMutableTreeNode("MAMCJ");
        DefaultMutableTreeNode pgdca=new DefaultMutableTreeNode("PGDCA");

        college.add(academic);

        academic.add(underGraduate);
        academic.add(graduate);
        underGraduate.add(bca);
        underGraduate.add(bit);
        underGraduate.add(be);
        
        graduate.add(mca);
        graduate.add(pgdca);
        graduate.add(mamcj);

        JTree jt =new JTree(college);

        f.add(jt);

        f.setSize(200,200);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

    public static void main(String[] args) {

    new JTreeExample();

    }
}
 