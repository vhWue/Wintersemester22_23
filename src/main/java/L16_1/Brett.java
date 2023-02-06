package L16_1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
  public Brett kombiniere(Brett zwei) {
	  
	  for (int i = 0; i < brett.length; i++) {
		for (int j = 0; j < brett[i].length; j++) {
			if(zwei.brett[i][j]) {
				this.brett[i][j]=zwei.brett[i][j];
			}
		}
	}
	  return this;
  }
  
}
