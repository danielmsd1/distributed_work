import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClientInputUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Distributed systems: Server-Client communication protocol");

        //adding the gridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        //labelText
        Text titleText = new Text("Fill all!");
        titleText.setFont(Font.font("Fredoka",FontWeight.BOLD,20));
        gridPane.add(titleText,1,0);

        //student number
        Label studentNumberL = new Label("Student number: ");
        gridPane.add(studentNumberL,0,1);
        TextField studentNumberText = new TextField();
        gridPane.add(studentNumberText,1,1);

        //firstName
        Label fName = new Label("FirstName: ");
        gridPane.add(fName,0,2);
        TextField fNameT = new TextField();
        gridPane.add(fNameT,1,2);

        //surname
        Label sName = new Label("Surname: ");
        gridPane.add(sName,2,2);
        TextField sNameT = new TextField();
        gridPane.add(sNameT,3,2);

        //faculty
        Label faculty = new Label("Faculty: ");
        gridPane.add(faculty,0,3);
        TextField facultyT = new TextField();
        gridPane.add(facultyT,1,3);

        //course
        Label course = new Label("Course: ");
        gridPane.add(course,2,3);
        TextField courseT = new TextField();
        gridPane.add(courseT,3,3);

        //degree
        Label degree = new Label("Degree: ");
        gridPane.add(degree,4,3);
        TextField degreeT = new TextField();
        gridPane.add(degreeT,5,3);

        //status feedback
        Label label = new Label("Status: ");
        gridPane.add(label,0,4);

        Text statusText = new Text("No submissions!");
        statusText.setFill(Paint.valueOf("brown"));
        statusText.setFont(Font.font("Fredoka",FontWeight.BOLD,15));
        gridPane.add(statusText,1,4);

        //submit button
        Button button = new Button("Submit Details");
        button.setAlignment(Pos.BOTTOM_LEFT);
        gridPane.add(button,0,5);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String admNum = studentNumberText.getText().trim();
                String fName = fNameT.getText().trim();
                String sName = sNameT.getText().trim();
                String facultyName = facultyT.getText().trim();
                String courseName = courseT.getText().trim();
                String degreeName = degreeT.getText().trim();
            }
        });

        Scene scene = new Scene(gridPane,600,550);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
