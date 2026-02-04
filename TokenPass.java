public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  ArrayList <Integer> board = new ArrayList <Integer>();
  board.size().equals(playerCount);
  int currentPlayer = (int)(Math.random()*playerCount-1);
  for(int x: board)
  {
    Random rand = new Random();
    board.add(rand.nextInt(10));
  }
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  for(int x = currentPlayer; x < 0; x++;)
  {
    currentPlayer(x) ++;
    
  }
  
  
}
