package org.example;

@Component
public class ShoppingCart
{
    public void checkout(String status)
    {
        System.out.println("Checkout method called...");
    }
    public int sendAmount(String status)
    {
        System.out.println("sendAmount method called...");
        int k = 5;
        return k;
    }
}