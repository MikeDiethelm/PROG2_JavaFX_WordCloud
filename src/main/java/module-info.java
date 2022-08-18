module com.example.prog2_javafx_wordcloud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prog2_javafx_wordcloud to javafx.fxml;
    exports com.example.prog2_javafx_wordcloud;
}