package com.bisonswap.painting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProjectActivity extends AppCompatActivity {

    DatabaseReference ref;

    String projectId;
    Project project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        ref = FirebaseDatabase.getInstance().getReference();
        projectId = getIntent().getExtras().get("id").toString();

        setTitle(projectId);

        //project = new Project(p, projectName);




    }
}
