import java.util.Random;

import models.Models;
import models.Models.Piece;
import models.Models.Player;

public class Service {

    //コンストラクタ-------------------------------------
    public Service()
    {
        CreateTable();
        ChooseFirstPl();
    }

    //盤面作成------------------------------------------
    private Piece[][] table;

    private void CreateTable()
    {
        table = new Piece[Models.TABLE_SIZE_Y][Models.TABLE_SIZE_X];
        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table[i].length; j++)
            {
                table[i][j] = Piece.None;
            }
        }
    }

    public Piece[][] GetTable() { return table; }

    //先手決定------------------------------------------
    private Player firstPl = Player.None;
    private Player nowPl = Player.None;

    private void ChooseFirstPl()
    {
        Random rand = new Random();
        if (rand.nextBoolean()) firstPl = Player.Pl1;
        else firstPl = Player.Pl2;
        nowPl = firstPl;
    }

    public Player GetFirstPl() { return firstPl; }
    public Player GetNowPl() { return nowPl; }

    //入力チェック-------------------------------------
    public Boolean CheckInput(String str)
    {
        int a = 0;
        try { a = Integer.valueOf(str); }
        catch (NumberFormatException ex) { ex.printStackTrace(); return false;}

        if (a - 1 < 0 || Models.TABLE_SIZE_X < a - 1) return false;

        return true;
    }

    //駒を落とす--------------------------------------
    public void FallPiece(int x)
    {
        for (int i = 0; i < table[x].length; i++)
        {

        }
    }
}