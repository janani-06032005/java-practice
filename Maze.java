package Backtracking;

import java.util.*;

public class Maze {
    public static void main(String[] args) {
//        System.out.println (count(3,3));

//        System.out.println(pathRet("",3,3));

        boolean [] [] maze ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(allPath("",maze,0,0));
    }


//    return the count of all possible paths


    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left =  count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }

//    returns the all possible paths (down and right)

    static void path(String p, int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }

        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }

//    returns all the paths (horizontal,vertical, diagonal) as array list


    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList <String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRet(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRet(p+"V",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+"H",r,c-1));
        }
        return list;
    }

// returns the path with restrictions as arraylist

    static ArrayList<String> pathRestrictionsRet(String p,boolean [][] maze, int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList <String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }

        if(r<maze.length-1){
            list.addAll(pathRestrictionsRet(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(pathRestrictionsRet(p+"R",maze,r,c+1));
        }
        return list;
    }






    static ArrayList<String> allPath(String p,boolean [][] maze, int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        ArrayList <String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }

        maze[r][c]= false;

        if(r<maze.length-1){
            list.addAll(allPath(p+"D",maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(allPath(p+"R",maze,r,c+1));
        }
        if(r>0){
            list.addAll(allPath(p+"U",maze,r-1,c));
        }
        if(c>0){
            list.addAll(allPath(p+"L",maze,r,c-1));
        }

        maze[r][c]=true;
        return list;
    }




}
