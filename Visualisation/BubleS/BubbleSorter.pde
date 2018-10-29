class BubbleSorter{
  int [] array;
  int i,j;
  int d;
  BubbleSorter(int length){
    d = length;
    array = new int[width/d];
    for(int i = 0; i < array.length; i++) {
      array[i] = (int) random (height/2);
    }   
    }
  
  void step(){
    if(i==array.length-1){
      i=j;
      j++;
      if (j==array.length){
      j=0; 
      i=0;
    }
    }
    
    if (array[i] > array[i+1]){
      int tmp = array[i];
      array[i] = array[i+1];
      array[i+1] = tmp;  
    }
    i++;    
  }
  void display(){
    for(int i =0;i<array.length; i++){
      fill(array[i],255-array[i],0);
      rect(i*d,height/2,d,-1*(height/2-array[i]));
    }
  }
}
