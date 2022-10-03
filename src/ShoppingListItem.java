public class ShoppingListItem
{
    private String itemName;
    private double cost;
    private int quantity;

    public ShoppingListItem(String n, double p, int q)
    {
        itemName = n;
        cost = p;
        quantity = q;
    }

    public double totalCost()
    {
        return cost * quantity;
    }

    public void increaseQuantity(int incAmount)
    {
        quantity += incAmount;
    }

    public String toString()
    {
        String s = "name: " + itemName + " price: " + cost + " quantity: " + quantity;
        return s;
    }
}