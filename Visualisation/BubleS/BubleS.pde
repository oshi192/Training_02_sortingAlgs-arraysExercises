BubbleSorter sorter;
void setup(){
 size(800,400);
 sorter = new BubbleSorter(20);
}

void draw(){
  background(255);
  sorter.display();
  sorter.step();
}
