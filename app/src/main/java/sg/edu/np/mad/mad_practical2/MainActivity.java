package sg.edu.np.mad.mad_practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=findViewById(R.id.displayname);
        textView1.setText(user1.name);
        TextView textView2=findViewById(R.id.displaydescription);
        textView2.setText(user1.description);
    }
    User user1=new User("John","nice",3,false);

    public void Click(View view){
        TextView follow=findViewById(R.id.follow);
        if (user1.followed){
            follow.setText("Unfollow");
            user1.followed=false;
        }
        else{
            follow.setText("follow");
            user1.followed=true;
        }
    }


        public class User{
        String name;
        String description;
        int id;
        boolean followed;
        public User(String n,String d,int i,boolean f){
            this.name=n;
            this.description=d;
            this.id=i;
            this.followed=f;
        }

    }


}