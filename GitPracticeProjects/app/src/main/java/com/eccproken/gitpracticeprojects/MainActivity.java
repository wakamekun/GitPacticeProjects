package com.eccproken.gitpracticeprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.eccproken.gitpracticeprojects.merge_files.IshikawaM;
import com.eccproken.gitpracticeprojects.merge_files.KobayashiM;
import com.eccproken.gitpracticeprojects.merge_files.SoejimaM;
import com.eccproken.gitpracticeprojects.merge_files.TanakaM;
import com.eccproken.gitpracticeprojects.personal_commit_files.StringFactory;
import com.eccproken.gitpracticeprojects.remote_commit_files.IshikawaR;
import com.eccproken.gitpracticeprojects.remote_commit_files.KobayashiR;
import com.eccproken.gitpracticeprojects.remote_commit_files.NakamichiR;
import com.eccproken.gitpracticeprojects.remote_commit_files.SoejimaR;
import com.eccproken.gitpracticeprojects.remote_commit_files.TanakaR;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPersonalCommitTextView();
        setRemoteCommitTextView();
        setMergeTextView();
    }

    private void setPersonalCommitTextView() {
        final TextView personalTextView = (TextView)findViewById(R.id.personalTextView);
        StringFactory stringFactory = new StringFactory();
        String setText = stringFactory.returnString();
        personalTextView.setText(setText);
    }

    private void setRemoteCommitTextView() {
        final TextView remoteTextView = (TextView)findViewById(R.id.remoteTextView);
        IshikawaR ishikawaR = new IshikawaR();
        KobayashiR kobayashiR = new KobayashiR();
        NakamichiR nakamichiR = new NakamichiR();
        SoejimaR soejimaR = new SoejimaR();
        TanakaR tanakaR = new TanakaR();
        String hello =  ishikawaR.returnH() +
                        kobayashiR.returnE() +
                        nakamichiR.returnL() +
                        soejimaR.returnL() +
                        tanakaR.returnO();
        remoteTextView.setText(hello);
    }

    private void setMergeTextView(){
        new IshikawaM().ishikawaSetText((TextView)findViewById(R.id.mergeTextViewIshikawa));
        new KobayashiM().kobayashiSetText((TextView)findViewById(R.id.mergeTextViewKobayashi));
        new SoejimaM().soejimaSetText((TextView)findViewById(R.id.mergeTextViewSoejima));
        new TanakaM().tanakaSetText((TextView)findViewById(R.id.mergeTextViewTanaka));
    }
}
