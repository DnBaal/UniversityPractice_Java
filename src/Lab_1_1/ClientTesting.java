package Lab_1_1;


import Lab_1_1.Client;

public class ClientTesting {

    public static void RunTest(){


        Client client1 = new Client("Dan", "Prod", 500.4f);

        System.out.println("ClientTest started..");
        if ( client1.think().equals("hello juicyworld ill use your song") ) {
            System.out.println("test correct, method think() returns: "+ client1.think());
        } else System.err.println("error");

        if (client1.getName().isEmpty()) {
            System.err.println("Client has no name");
        } else System.out.println("test correct method getName() works well and returns: "+client1.getName());


    }
}
