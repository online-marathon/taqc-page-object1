package com.softserve.edu.teachua.pages;

import org.openqa.selenium.WebDriver;

public class ClubDetailsPage extends TopPart {

    // TODO

    public ClubDetailsPage(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
    }

    // Page Object

    // Functional

    // Business Logic

    public ClubCommentModal openClubCommentModal() {
        // TODO
        return new ClubCommentModal(driver);
    }

}
