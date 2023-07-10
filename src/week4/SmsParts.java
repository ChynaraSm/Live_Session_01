package week4;

public class SmsParts {
    /*
    SmsParts [substring, indexOf]
	Create a program that will has a message String in this exact format:
		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}
	The content of name, number and message can vary, so based on the format extract those parts and output them.
	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}
	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving
     */
    public static void main(String[] args) {
        String msg="Sender:<Omer Karahan>. From Number: [202-123-3456]. mMessage: {I love programming and problem solving}";
        int senderStart=msg.indexOf("<")+1;
        int senderEnd=msg.indexOf(">");

        int numberStart=msg.indexOf("[");
        int numberEnd=msg.indexOf("]");

        System.out.println("Sender: "+msg.substring(senderStart, senderEnd));
        System.out.println("Number: "+msg.substring(numberStart+1,numberEnd));
        System.out.println("Message: "+msg.substring(msg.indexOf("{")+1,msg.indexOf("}")));


    }
}
