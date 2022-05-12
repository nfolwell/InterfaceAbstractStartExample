public class SwimmingPool
{
  private int poolDepth;
  private int edge1distance;
  private int edge2distance;
  private boolean hasDivingBoard;
  
  public SwimmingPool(int depth, int edge1, int edge2, boolean divingBoard)
  {
    poolDepth = depth;
    edge1distance = edge1;
    edge2distance = edge2;
    hasDivingBoard = divingBoard;
  }
  
  public boolean canDiveInPool()
  {
    if (hasDivingBoard)
    {
      return true;
    }
    return poolDepth > 6;
  }
}