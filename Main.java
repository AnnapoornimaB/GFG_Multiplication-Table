class Solution
{
    static ArrayList<Integer> getTable(int N)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>(N);
        for(int i=1;i<=10;i++)
        {
            arr.add(i*N);
        }
        return arr;
    }
}
