// Generated code from Butter Knife. Do not modify!
package com.cloudspace.jindun.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisterActivity$$ViewBinder<T extends com.cloudspace.jindun.activity.RegisterActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493068, "field 'mRegisterLoge' and method 'onClick'");
    target.mRegisterLoge = finder.castView(view, 2131493068, "field 'mRegisterLoge'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493070, "field 'mRegisterEtId'");
    target.mRegisterEtId = finder.castView(view, 2131493070, "field 'mRegisterEtId'");
    view = finder.findRequiredView(source, 2131493072, "field 'mRegisterEtPrass'");
    target.mRegisterEtPrass = finder.castView(view, 2131493072, "field 'mRegisterEtPrass'");
    view = finder.findRequiredView(source, 2131493073, "field 'mRegisterBtShowpass' and method 'onClick'");
    target.mRegisterBtShowpass = finder.castView(view, 2131493073, "field 'mRegisterBtShowpass'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493074, "field 'mRegisterBtShowpassUp' and method 'onClick'");
    target.mRegisterBtShowpassUp = finder.castView(view, 2131493074, "field 'mRegisterBtShowpassUp'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493075, "field 'mRegisterTvForgetpass' and method 'onClick'");
    target.mRegisterTvForgetpass = finder.castView(view, 2131493075, "field 'mRegisterTvForgetpass'");
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
    target.mRegisterLoge = null;
    target.mRegisterEtId = null;
    target.mRegisterEtPrass = null;
    target.mRegisterBtShowpass = null;
    target.mRegisterBtShowpassUp = null;
    target.mRegisterTvForgetpass = null;
  }
}
