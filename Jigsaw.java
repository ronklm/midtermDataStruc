import java.io.*;
import java.util.*;

public class Jigsaw
{
    //implement Hashing 
    public static class Node
    {
        public String key;
        public Integer value;
        public Node next;

        public Node(String key, Integer value, Node next)
        {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    Node[] puzzle;

    public void HashMap(int size)
    {
        puzzle = new Node[size]; // figure out how to pass in from first line of file
    }

    //get node from key
    private Node getNode(String key)
    {
        int h = hash(key);
        for (Node c = puzzle[h]; c != null; c = c.next)
            if (key.equals(c.key)) return c;
        return null;
    }

    // get key  
    public Integer get(String key)
    {
        Node n = getNode(key);
        return n == null ? null : n.value;
    }

    // insert value 
    public void put(String key, Integer value)
    {
        Node n = getNode(key);
        if (n == null) // shouldn't need it but just in case n is greater than k
        {
            int h = hash(key);
            puzzle[h] = new Node(key, value, puzzle[h]); 
        }
        else
        {
            n.value = value;
        }
    }

    //hashing 
    private int hash(String key)
    {
        int x = 421;
        int h = 0;
        for (int i = 0; i < key.length(); i++)
            h = (h * x + (int) key.charAt(i)) % puzzle.length;
        return h;
    }
    
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
        scan.close();

        

    }

}