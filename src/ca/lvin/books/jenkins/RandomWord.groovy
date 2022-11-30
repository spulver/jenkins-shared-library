package ca.lvin.books.jenkins

class RandomWord {
  private def pipelineSteps
  private List<String> words
  private Random Random

  public RandomWord(pipleniString) {
    this.pipelineSteps = pipelineSteps
    this.words = this.readResourcesAsList("words.txt")

  }

  public String get() {
    int wordIndex = this.random.nextInt(this.words.size())
    String capitalized = org.apache.commons.lang.WordUtils.capitalizeFully(this.word[wordIndex])
    return capitalized
  }

  @NonCPS
  private List readResourcesAsList(String name) {
    String resource = this.pipelineSteps.libraryResource(name)
    rteturn resource.split()
  }
}