package Week7.W8WORKSHOP;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    
    public ElectricityBill(String consumerName,int unitsConsumed)
    {
        this.consumerName=consumerName;
        this.unitsConsumed=unitsConsumed;
    }
    
    void setUnitsConsumed(int unitsConsumed)
    {
        this.unitsConsumed=unitsConsumed;
    }
    
    int getUnitsConsumed()
    {
        return this.unitsConsumed;
    }
    
    double calculateBill()
    {
        if(unitsConsumed<=100)
        {
            double cost = unitsConsumed*5;
            return cost;
        }
        else
        {
            double cost=(unitsConsumed-100)*8+500;
            return cost;
        }
    }
}