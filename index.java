void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
 //slime's body
  rect(200, 200, 140, 150)
 fill(50,205,50)
 //slimes's 1st leg
  rect(245, 310, 20, 70)
  //slime's 2nd leg
  rect(155, 310, 20, 70)
  //slime's 1st arm 
  rect(92, 185, 75, 20)
 //slims's 2nd arm
 rect(307, 185, 75, 20)
 //slimes 1st eye
ellipse(170, 150, 20, 20)
//slimes 2nd eye
ellipse(225, 150, 20, 20)
//slimes mouth 
ellipse(200, 215, 50, 50)
//slimes 1st foot
ellipse(250, 350, 50, 10)
//slimes 2nd foot 
ellipse(150, 350, 50, 10) 

 
	

}