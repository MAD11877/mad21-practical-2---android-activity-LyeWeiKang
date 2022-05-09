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
    User user1=new User("John","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum",3,false);

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
//
    }
