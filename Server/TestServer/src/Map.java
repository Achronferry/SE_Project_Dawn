import java.util.Vector;
import java.util.Random;

public class Map {
    Random rand=new Random();

    class Role_simple {
        public int id;
        public  String name;
        public int lifevalue;
        public int[] location;
        public int direction;
        public int walk_mov; //û��walk����0��һ��walk����������++����Ϲ���
        public int attack_mov;
    };
    class Prop {
        private int id;
        private int type; //0-medicine; 1-shoe; 2-weapon;
        private int value;
        private int[] propposition;
        //public Prop(int t){};
    }

    public Vector<Role_simple> livingrole;
    public Vector<Prop> proplist;
    public Vector<Role_simple> rankrecord;
    public int[][] m;

    Map (int propnums=0){
        //��ʼ��m;
        //����ص����ɵ��ߣ���m�иõ�ֵ��Ϊpropid

        for (int i=0;i<propnums;i++){

        }
    private boolean AddRole(int id,String n){        //��ʼ�����ﲢ����ص�

    }

    }
