// Generated code from Butter Knife. Do not modify!
package com.cloudspace.jindun.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ForgetpassActivity$$ViewBinder<T extends com.cloudspace.jindun.activity.ForgetpassActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493049, "field 'mBack' and method 'onClick'");
    target.mBack = finder.castView(view, 2131493049, "field 'mBack'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493051, "field 'mForgetEtId'");
    target.mForgetEtId = finder.castView(view, 2131493051, "field 'mForgetEtId'");
    view = finder.findRequiredView(source, 2131493053, "field 'mForgetBtAddImage' and method 'onClick'");
    target.mForgetBtAddImage = finder.castView(view, 2131493053, "field 'mForgetBtAddImage'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493055, "field 'mForgetBtPresent' and method 'onClick'");
    target.mForgetBtPresent = finder.castView(view, 2131493055, "field 'mForgetBtPresent'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mBack = null;
    target.mForgetEtId = null;
    target.mForgetBtAddImage = null;
    target.mForgetBtPresent = null;
  }
}
