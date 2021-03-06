// Generated by view binder compiler. Do not edit!
package com.example.easycooking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.easycooking.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistratiBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView accediRegistrati;

  @NonNull
  public final Button btnRegistra;

  @NonNull
  public final CheckBox terminiPrivacy;

  @NonNull
  public final TextInputEditText textCognome;

  @NonNull
  public final TextInputEditText textEmail;

  @NonNull
  public final TextInputEditText textNome;

  @NonNull
  public final TextInputEditText textPassword;

  @NonNull
  public final TextView textRegistra;

  @NonNull
  public final TextView titolo;

  private ActivityRegistratiBinding(@NonNull LinearLayout rootView,
      @NonNull TextView accediRegistrati, @NonNull Button btnRegistra,
      @NonNull CheckBox terminiPrivacy, @NonNull TextInputEditText textCognome,
      @NonNull TextInputEditText textEmail, @NonNull TextInputEditText textNome,
      @NonNull TextInputEditText textPassword, @NonNull TextView textRegistra,
      @NonNull TextView titolo) {
    this.rootView = rootView;
    this.accediRegistrati = accediRegistrati;
    this.btnRegistra = btnRegistra;
    this.terminiPrivacy = terminiPrivacy;
    this.textCognome = textCognome;
    this.textEmail = textEmail;
    this.textNome = textNome;
    this.textPassword = textPassword;
    this.textRegistra = textRegistra;
    this.titolo = titolo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistratiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistratiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registrati, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistratiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accedi_registrati;
      TextView accediRegistrati = rootView.findViewById(id);
      if (accediRegistrati == null) {
        break missingId;
      }

      id = R.id.btn_registra;
      Button btnRegistra = rootView.findViewById(id);
      if (btnRegistra == null) {
        break missingId;
      }

      id = R.id.termini_privacy;
      CheckBox terminiPrivacy = rootView.findViewById(id);
      if (terminiPrivacy == null) {
        break missingId;
      }

      id = R.id.text_cognome;
      TextInputEditText textCognome = rootView.findViewById(id);
      if (textCognome == null) {
        break missingId;
      }

      id = R.id.text_email;
      TextInputEditText textEmail = rootView.findViewById(id);
      if (textEmail == null) {
        break missingId;
      }

      id = R.id.text_nome;
      TextInputEditText textNome = rootView.findViewById(id);
      if (textNome == null) {
        break missingId;
      }

      id = R.id.text_password;
      TextInputEditText textPassword = rootView.findViewById(id);
      if (textPassword == null) {
        break missingId;
      }

      id = R.id.textRegistra;
      TextView textRegistra = rootView.findViewById(id);
      if (textRegistra == null) {
        break missingId;
      }

      id = R.id.titolo;
      TextView titolo = rootView.findViewById(id);
      if (titolo == null) {
        break missingId;
      }

      return new ActivityRegistratiBinding((LinearLayout) rootView, accediRegistrati, btnRegistra,
          terminiPrivacy, textCognome, textEmail, textNome, textPassword, textRegistra, titolo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
