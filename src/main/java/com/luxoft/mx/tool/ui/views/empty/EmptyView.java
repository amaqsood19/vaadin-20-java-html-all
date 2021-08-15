package com.luxoft.mx.tool.ui.views.empty;

import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.luxoft.mx.tool.ui.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("Empty")
@Route(value = "empty", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Tag("empty-view")
@JsModule("./views/empty/empty-view.ts")
public class EmptyView extends LitTemplate {

    // This is the Java companion file of a design
    // You can find the design file inside /frontend/views/

    public EmptyView() {
    }
}
