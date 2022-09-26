package com.herokuapp.tasks;

import com.herokuapp.models.EditorOptionModel;
import com.herokuapp.utils.enums.OptionEditorEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static com.herokuapp.userinterfaces.HomePage.LABEL_MENU_OPTIONS_EXAMPLES;
import static com.herokuapp.userinterfaces.JavaScriptAlertsPage.*;

public class SelectIframeModifyFormat implements Task {
    private EditorOptionModel editor;


    public SelectIframeModifyFormat(EditorOptionModel editor) {
        this.editor=editor;
    }

    public static Performable modifyFormat(EditorOptionModel editor) {
        return Tasks.instrumented(SelectIframeModifyFormat.class, editor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_MENU_OPTIONS_EXAMPLES.of(OptionEditorEnum.MENU_FRAMES.getOption())),
                Click.on(LABEL_MENU_OPTIONS_EXAMPLES.of(OptionEditorEnum.MENU_IFRAME.getOption())),
                Switch.toFrame(0),
                Enter.theValue(editor.getContent()).into(TEXT_AREA_EDITOR_INITIAL),
                Click.on(MENU_EDITOR.of(OptionEditorEnum.MENU_EDIT.getOption())),
                Click.on(OPTION_FONT.of(OptionEditorEnum.OPTION_SELECT_ALL.getOption())),
                Click.on(MENU_EDITOR.of(OptionEditorEnum.MENU_FORMAT.getOption())),
                Click.on(OPTION_FONT.of(OptionEditorEnum.OPTION_FONT_SIZES.getOption())),
                Click.on(OPTION_FONT.of(editor.getSize())),
                Click.on(MENU_EDITOR.of(OptionEditorEnum.MENU_FORMAT.getOption())),
                Click.on(OPTION_FONT.of(OptionEditorEnum.OPTION_FONTS.getOption())),
                Click.on(OPTION_FONT.of(editor.getSource())),
                Click.on(MENU_EDITOR.of(OptionEditorEnum.MENU_FORMAT.getOption())),
                Click.on(OPTION_FONT.of(OptionEditorEnum.OPTION_TEXT_COLOR.getOption())),
                Click.on(OPTION_COLOR.of(editor.getColor())),
                Click.on(OPTION_ALIGN.of(editor.getAlignment()))
        );
    }
}
