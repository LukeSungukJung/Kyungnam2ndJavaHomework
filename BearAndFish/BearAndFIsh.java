import java.util.*;
public class BearAndFIsh {
public static void main(String[] emiemi){
 String [][] BF=new String[10][20];
 Scanner sc= new Scanner(System.in);
for(int i=0;i<BF.length;i++){
for(int j=0;j<BF[i].length;j++){
 if(i==0&&j==0) 
   BF[0][0]="▼";
 else if(i==5&&j==10)
  BF[5][10]="♨";
 else BF[i][j]="-";
       }
         }
//곰과물고기 게임
for(int i=0;i<BF.length;i++){
for(int j=0;j<BF[i].length;j++){
System.out.print(BF[i][j]);
       }
System.out.println();
        }//게임판 출력
System.out.println("곰: "+"▼");
System.out.println("물고기: "+"♨");
System.out.print("w(위)"+"s(아래)"+"a(왼쪽)"+"d(오른쪽)"+"입력 :");
String control;
int xcurrent =0;
int ycurrent =0;
int fxcurrent =5;
int fycurrent =10;
double fish_moving;
double fish_move;
int count =0;
BF_rute: while(true){
 ++count;
  fish_moving =Math.random();
 System.out.print("w(위)"+"s(아래)"+"a(왼쪽)"+"d(오른쪽)"+"입력 :");
 control= sc.next(); //조종자 입력
 if(control.equals("s")){
  if(xcurrent==9){
   BF[xcurrent][ycurrent]="-";
   xcurrent=0;
   BF[xcurrent][ycurrent]="▼";
   
  }else{
  BF[++xcurrent][ycurrent]="▼";
  BF[xcurrent-1][ycurrent]="-";
  }
 }
 else if(control.equals("w")){
  if(xcurrent==0){
   BF[xcurrent][ycurrent]="-";
   xcurrent=9;
   BF[xcurrent][ycurrent]="▼";
   
  }else{
  BF[--xcurrent][ycurrent]="▼";
  BF[xcurrent+1][ycurrent]="-";
  }
 }
 else if(control.equals("a")){
  if(ycurrent==0){
   BF[xcurrent][ycurrent]="-";
   ycurrent=19;
   BF[xcurrent][ycurrent]="▼";
   
  }else{
  BF[xcurrent][--ycurrent]="▼";
  BF[xcurrent][ycurrent+1]="-";
  }
 }
 else if(control.equals("d")){
  if(ycurrent==19){
   BF[xcurrent][ycurrent]="-";
   ycurrent=0;
   BF[xcurrent][ycurrent]="▼";
   
  }else{
  BF[xcurrent][++ycurrent]="▼";
  BF[xcurrent][ycurrent-1]="-";
 }
 }
 if(fish_moving<=0.4){
  
  fish_move= Math.random();
  if(fish_move<=0.25){
   BF[++fxcurrent][fycurrent]="♨";
   BF[fxcurrent-1][fycurrent]="-";
   }
  else if(0.25<=fish_move&&fish_move<=0.5){
   BF[--fxcurrent][fycurrent]="♨";
   BF[fxcurrent+1][fycurrent]="-";
 }
  else if(0.5<=fish_move&&fish_move<=0.75){
   BF[fxcurrent][--fycurrent]="♨";
   BF[fxcurrent][fycurrent+1]="-";
  }
  else if(0.75<=fish_move&&fish_move<=1){
   BF[fxcurrent][++fycurrent]="♨";
   BF[fxcurrent][fycurrent-1]="-";
  }
 
 }
  
  for(int i=0;i<BF.length;i++){
  for(int j=0;j<BF[i].length;j++){
  System.out.print(BF[i][j]);
         }
  System.out.println();
          }//게임판 출력 
  
  if(BF[fxcurrent][fycurrent]==BF[xcurrent][ycurrent]){
    System.out.println("곰이 물고기를 잡아먹었습니다.");
   System.out.println("Game Over");
   System.out.println("곰이 물고기를 처먹는데 움직인 횟수:"+count);
   BF[fxcurrent][fycurrent] ="▼";
   for(int i=0;i<BF.length;i++){
    for(int j=0;j<BF[i].length;j++){
    System.out.print(BF[i][j]);
           }
    System.out.println();
            }//게임판 출력 
   break BF_rute;
  }
   
}//while 무한루프

 
}   
}
 