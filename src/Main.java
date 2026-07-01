import java.util.Scanner;

import models.Models.Piece;

public class Main {

    public static void main(String[] args) {
        Boolean GUI = false;
        if (GUI);
        else CUI();
    }


    //===========================================================

    private static void CUI()
    {
        Service service = new Service();
        Piece[][] table;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++)
        {
            table = service.GetTable();

            for (var col : table)
            {
                for (var pos : col)
                {
                    System.out.print(SetStr(pos) + "\t");
                }
                System.out.println();
            }
            for (int j = 1; j <= table[0].length; j++) { System.out.print(j + "\t"); }

            System.out.println("\n\n" + service.GetNowPl() + " の番");
            System.out.print("列番号を入力してください：");

            String str = sc.next();
            int input = 0;
            if (service.CheckInput(str)) input = Integer.valueOf(str) - 1;
            else {
                System.out.println("無効な入力です");
                continue;
            }
            System.out.println(input);
        }



        sc.close();
    }

    //表示テキスト設定-----------------------------------
    private static String SetStr(Piece color)
    {
        String str = "";

        switch (color)
        {
        case Piece.None:
            str = "-";
            break;

        case Piece.Black:
            str = "○";
            break;

        case Piece.White:
            str = "●";
            break;

        default:
            str = "×";
            break;
        }

        return str;
    }
}