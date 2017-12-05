package com.bisonswap.painting;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddProject extends AppCompatActivity {

    DatabaseReference ref;

    EditText projectInput;
    Button addProjectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_project);

        ref = FirebaseDatabase.getInstance().getReference();

        projectInput = (EditText) findViewById(R.id.project_name_input);
        addProjectButton = (Button) findViewById(R.id.add_project_button);

        setTitle("Create new project");

        addProjectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String projectName = projectInput.getText().toString();
                String projectId = String.valueOf(SystemClock.currentThreadTimeMillis());
                Project project = new Project(projectId, projectName);

                //ref.child(projectId).push().setValue(project);
                ref.child(projectId).push().setValue(project);

                Intent intent = new Intent(AddProject.this, ProjectActivity.class);
                intent.putExtra("id", projectId);
                startActivity(intent);
            }
        });
    }
}
