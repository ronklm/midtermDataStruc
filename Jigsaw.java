import java.io.*;
import java.util.*;

public class Jigsaw
{
    public void print()
    {
        int pieces = 0; // want to pass in the checkPieces result
        //print out completion statement if pieces lost is zero
        if (pieces == 0)
        {
            System.out.print("The puzzle is complete.");
        }
        //print out missing statement with int concat string of how many pieces missing
        else
        {
            System.out.print("Missing " + pieces +"jigsaw piece(s).");
        }
    }
    
    public int checkPieces(int arr[], int k)
    {
        int piecesTotal = k;
        int piecesMissing = 0;
        
        for (int i = 1; i <= piecesTotal; i++) 
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j]);
        }

        return piecesMissing;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // FileReader read = new FileReader(String scan);
        // String fLine = read.readLine();
        //gotta understand how scanner items work

        

    }

}