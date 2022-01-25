package com.cordovanicolas.eva3cordova;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginFragment extends Fragment {
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.fragment_econt3, container, false);
        final TextInputLayout passwordTextInput= view.findViewById(R.id.password_text_input);
        final TextInputEditText passwordEditText= view.findViewById(R.id.password_edit_text);
        MaterialButton nextButton =view.findViewById(R.id.next_button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isPasswordValid(passwordEditText.getText())){
                    passwordTextInput.setError(getString(R.string.passwordError));
                } else{
                    passwordTextInput.setError(null);
                }

            }
        });

        return view;}


    private boolean isPasswordValid(@Nullable Editable text){

        return text != null && text.length()>=6;
    }
}
