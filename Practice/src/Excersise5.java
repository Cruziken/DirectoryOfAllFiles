

public class Excersise5 {

private void Start() {
	
	//Creates an instance of Screamers called fun1
	Screamers fun1 = new Screamers();
	//Calls the sCream method on fun1
	fun1.sCream();
}
private void Continue() {
	
	//Creates an instance of Cpy called fun2
	Cpy fun2 = new Cpy();
	//Calls the proClain method on fun2
	fun2.proClain();
	//Calls the readandScan method on fun2
	fun2.readandScan();
	
}
private void Finish(){
	//Creates an instance of Copiers called fun3
	Copiers fun3 = new Copiers();
	//Calls the copyIt method on fun3 
	fun3.copyIt();
}

public static void main(String[] args){
	// Creates an instance of Excersise5 named task
	Excersise5 task = new Excersise5();
	//Calls the Start method on task. Starts the app
	task.Start();
	task.Continue();
	task.Finish();

}
}
