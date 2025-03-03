import greenfoot.*;
import java.util.ArrayList;

/**
 * This class declares, instantiates, and initializes a new deck.  Students 
 * should then implement the sort method at the botton of this class to see 
 * if they understanding basic ArrayList sort algorithms.
 * 
 * @author Bruce Gustin
 * @version Feb 8, 2023
 */

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
    
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
        
        for(int i = 0; i < shuffledDeck.length; i++)
        { 
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
    
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
        
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    
    /* In this space write the pseudocode for your selection sort
     * for each iteration:
     * Store the first unsorted element of the array under a variable n
     * for each unsorted element, see if it less than n. If it is, store it as x and replace its position in the array with x.
     * add x in between the last sorted element and the first unsorted element. 
     * 
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        for (int i=0; i<arr.length; i++)
        {
            int indexOfLargestCard = i;
            Card switchStorage;
            for (int x = 0 + i; x < arr.length; x++)
            {
                if (arr[indexOfLargestCard].getValue() > arr[x].getValue())
                {
                    indexOfLargestCard = x;
                }
            }
            switchStorage = arr[i];
            arr[i] = arr[indexOfLargestCard];
            arr[indexOfLargestCard] = switchStorage;
        }
        
        return selectionSort;
    }
    
    /* In this space write the pseudocode for your insertion sort
     * for each element aside from the first, compare it 
     * 
     * 
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
        Card temp;
        for (int i = 1; i < arr.length; i++)
        {
            for (int x = i; x >= 1; x--)
            {
                if (arr[x].getValue() < arr[x-1].getValue())
                {
                    temp = arr[x-1];
                    arr[x-1] = arr[x];
                    arr[x] = temp;
                }
            }
        }
        return insertionSort;
    }
    
    /* In this space write the pseudocode for your merge sort
     * 
     * 
     * 
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

