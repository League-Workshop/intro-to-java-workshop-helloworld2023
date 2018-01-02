void setup(){
  size(900,900);
}
void draw(){
 background(172,240,176);
 if(mousePressed){
  fill(random(256),random(256),random(256));
 }
 else{
fill(mouseX,mouseY,50);
 }
 rect(100,100,400,300);
 ellipse(200,200,150,150);
}