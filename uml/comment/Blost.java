package uml.comment;

import java.util.List;

public class Blost {

  private String text;
  private List<Comment> comments;

  public void setBloText(String text) {
    this.text = text;
  }

  public void addComment(Comment comment) {
    this.comments.add(comment);
  }

  public String getBlost() {
    return null;
  }

  public List<Comment> getComments() {
    return comments;
  }

}
