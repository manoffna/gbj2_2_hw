package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][] {
                {"1", "3", "5", "4", "99" },
                {"6", "7", "11", "0" },
                {"33", "87", "100", "3"},
                {"44", "55", "99", "101"} };

        Mymethod(arr);
    }


        private static void Mymethod(String[][] a){
            int[][] c = new int[4][4];
            try {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        c[i][j] = Integer.parseInt(a[i][j]);
                        System.out.println(c[i][j]);
                        System.out.println(a.length);
                    }
                }
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
                e.getCause();
            }
        }
    }