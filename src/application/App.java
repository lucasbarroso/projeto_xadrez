package application;


import chess.ChessMatch;
import chess.pieces.Rook;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("teste?");
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
