// Generated code from Butter Knife. Do not modify!
package com.cloudspace.jindun.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WdActivity$$ViewBinder<T extends com.cloudspace.jindun.activity.WdActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131493078, "field 'mWdImageHead'");
    target.mWdImageHead = finder.castView(view, 2131493078, "field 'mWdImageHead'");
    view = finder.findRequiredView(source, 2131493079, "field 'mWdTextName'");
    target.mWdTextName = finder.castView(view, 2131493079, "field 'mWdTextName'");
    view = finder.findRequiredView(source, 2131493077, "field 'mWdCollectRl' and method 'onClick'");
    target.mWdCollectRl = finder.castView(view, 2131493077, "field 'mWdCollectRl'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493081, "field 'mWdImagePhone'");
    target.mWdImagePhone = finder.castView(view, 2131493081, "field 'mWdImagePhone'");
    view = finder.findRequiredView(source, 2131493082, "field 'mWdTextPhone'");
    target.mWdTextPhone = finder.castView(view, 2131493082, "field 'mWdTextPhone'");
    view = finder.findRequiredView(source, 2131493080, "field 'mWdCollectR2' and method 'onClick'");
    target.mWdCollectR2 = finder.castView(view, 2131493080, "field 'mWdCollectR2'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493084, "field 'mWdImagePass'");
    target.mWdImagePass = finder.castView(view, 2131493084, "field 'mWdImagePass'");
    view = finder.findRequiredView(source, 2131493085, "field 'mWdTextPass'");
    target.mWdTextPass = finder.castView(view, 2131493085, "field 'mWdTextPass'");
    view = finder.findRequiredView(source, 2131493083, "field 'mWdCollectR3' and method 'onClick'");
    target.mWdCollectR3 = finder.castView(view, 2131493083, "field 'mWdCollectR3'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131493086, "field 'mWdTextSys' and method 'onClick'");
    target.mWdTextSys = finder.castView(view, 2131493086, "field 'mWdTextSys'");
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
    target.mWdImageHead = null;
    target.mWdTextName = null;
    target.mWdCollectRl = null;
    target.mWdImagePhone = null;
    target.mWdTextPhone = null;
    target.mWdCollectR2 = null;
    target.mWdImagePass = null;
    target.mWdTextPass = null;
    target.mWdCollectR3 = null;
    target.mWdTextSys = null;
  }
}
