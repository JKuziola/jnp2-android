// Generated by view binder compiler. Do not edit!
package com.example.happyplant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.happyplant.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton buttonCancel;

  @NonNull
  public final MaterialButton buttonNewTask;

  @NonNull
  public final Guideline guidEnd;

  @NonNull
  public final Guideline guidStart;

  @NonNull
  public final TextInputLayout tilCycle;

  @NonNull
  public final TextInputLayout tilDate;

  @NonNull
  public final TextInputLayout tilTimer;

  @NonNull
  public final TextInputLayout tilTitle;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivityAddTaskBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton buttonCancel, @NonNull MaterialButton buttonNewTask,
      @NonNull Guideline guidEnd, @NonNull Guideline guidStart, @NonNull TextInputLayout tilCycle,
      @NonNull TextInputLayout tilDate, @NonNull TextInputLayout tilTimer,
      @NonNull TextInputLayout tilTitle, @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.buttonCancel = buttonCancel;
    this.buttonNewTask = buttonNewTask;
    this.guidEnd = guidEnd;
    this.guidStart = guidStart;
    this.tilCycle = tilCycle;
    this.tilDate = tilDate;
    this.tilTimer = tilTimer;
    this.tilTitle = tilTitle;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_cancel;
      MaterialButton buttonCancel = ViewBindings.findChildViewById(rootView, id);
      if (buttonCancel == null) {
        break missingId;
      }

      id = R.id.button_new_task;
      MaterialButton buttonNewTask = ViewBindings.findChildViewById(rootView, id);
      if (buttonNewTask == null) {
        break missingId;
      }

      id = R.id.guid_end;
      Guideline guidEnd = ViewBindings.findChildViewById(rootView, id);
      if (guidEnd == null) {
        break missingId;
      }

      id = R.id.guid_start;
      Guideline guidStart = ViewBindings.findChildViewById(rootView, id);
      if (guidStart == null) {
        break missingId;
      }

      id = R.id.tilCycle;
      TextInputLayout tilCycle = ViewBindings.findChildViewById(rootView, id);
      if (tilCycle == null) {
        break missingId;
      }

      id = R.id.til_date;
      TextInputLayout tilDate = ViewBindings.findChildViewById(rootView, id);
      if (tilDate == null) {
        break missingId;
      }

      id = R.id.til_timer;
      TextInputLayout tilTimer = ViewBindings.findChildViewById(rootView, id);
      if (tilTimer == null) {
        break missingId;
      }

      id = R.id.til_title;
      TextInputLayout tilTitle = ViewBindings.findChildViewById(rootView, id);
      if (tilTitle == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityAddTaskBinding((ConstraintLayout) rootView, buttonCancel, buttonNewTask,
          guidEnd, guidStart, tilCycle, tilDate, tilTimer, tilTitle, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
