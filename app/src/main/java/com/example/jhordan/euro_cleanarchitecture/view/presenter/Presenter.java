package com.example.jhordan.euro_cleanarchitecture.view.presenter;

public class Presenter<T extends Presenter.View> {

    private T view;

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }

    public void initialize() {

    }

    public interface View {

        void showLoading();

        void hideLoading();
    }
}
