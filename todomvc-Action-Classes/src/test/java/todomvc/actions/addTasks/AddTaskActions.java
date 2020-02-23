package todomvc.actions.addTasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Keys;


 public class AddTaskActions extends UIInteractionSteps {

     public void withName(String task) {

        $(NewTodoForm.NEW_TODO_INPUT).sendKeys(task,Keys.ENTER);
    }
}


