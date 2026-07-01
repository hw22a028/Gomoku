package models;

public class Models {

    //盤面サイズ--------------------------------
    final static public int TABLE_SIZE_X = 15;
    final static public int TABLE_SIZE_Y = 20;

    //駒の種類----------------------------------
    public enum Piece
    {
        None,
        Black,
        White,
    }

    //プレイヤー--------------------------------
    public enum Player
    {
        None,
        Pl1,
        Pl2,
    }
}