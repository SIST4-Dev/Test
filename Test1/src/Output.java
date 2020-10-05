import java.util.Vector;
public class Output {
    private Vector<Employee> vector;
    private Vector<Employee> vector2;
    public Output(Vector<Employee> vector, Vector<Employee> vector2) {
        this.vector = vector;
        this.vector2 = vector2;
        
    }
    
    void output() {
        System.out.println("\t\t<<�޿����� ���α׷�>>");
        this.printLine();
        //System.out.println("���\t�޼�\tȣ\t����\t���޾�\t����\t�������޾�");
        System.out.printf("%5s\t%5s\t%5s\t%7s\t%7s\t%5s\t%10s\n","���", "�޼�", "ȣ", "����", "���޾�", "����", "�������޾�");
        this.printLine();
        
        for(int i=0; i<this.vector.size(); i++) {
            Employee p = this.vector.elementAt(i);
            //no(���), level(�޼�), ho(ȣ��), sudang(����), paid(���޾�), tax(����), realPaid(�������޾�)
            System.out.printf(
                    "%5d\t%5d\t%5d\t%7d\t%7d\t%5d\t%10d\n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang(), p.getPaid(), p.getTax(), p.getRealPaid()
                    );
        }
        
        System.out.println();
        this.printLine();
        System.out.println();
        System.out.println("\n\n�Էµ���Ÿ ���");
        for(int i=0; i<this.vector2.size(); i++) {
            Employee p = this.vector2.elementAt(i);
            System.out.printf(
                    "%5d\t%5d\t%5d\t%8d%n",
                    p.getNo(), p.getLevel(), p.getHo(), p.getSudang()
                    );
        }
        
    }//output
    
    
    //�׳� �����Դϴ�.
    private void printLine() {
        for(int i=0; i<64; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    
    
}//Output 