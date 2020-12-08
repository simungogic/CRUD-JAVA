package main;

import java.util.EventListener;

public interface GuiListener extends EventListener {
    public void guiEventOccured(GuiEvent e);
}
