import React from "react";
import logo from "./logo.svg";
import "./App.css";

//6.ExpenseComponent will return JSX
//6.whic div wrapping expenses description and expenses amount
//6.jsx get return

function TweetComponent(props) {
  console.log(props);

  return (
    <div className="feed">
      <div className="image">
        <img src={props.tweet.userImageUrl} />
      </div>
      <div className="feedname">
        {props.tweet.username}
        <br />
        {props.tweet.userHandle}
      </div>

      <div className="feedmessage">{props.tweet.message}</div>
    </div>
  );
}
//1.when application start state of construction gets run
//1.our state set expenses with empty list
class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      tweets: [],
    };
  }

  //2.we get the data from the backend populate our state
  componentDidMount() {
    //we using this method using fetch
    //fetch bthis data whatever it come use function to run it
    fetch("http://localhost:8080/getAllRecord")
      .then((response) => response.json())
      .then((data) =>
        this.setState({
          tweets: data,
        })
      );
  }

  //5.Inside it we have a empty list
  //5.every state in our expenses pass to ExpenseComponent
  //7.jsx get return added inside body list
  //7.once the for loop is done it return the body
  //7.WHole thing get render
  rendertweets() {
    let body = [];
    this.state.tweets.forEach((tweet) => {
      body.push(<TweetComponent tweet={tweet} />);
    });
    return body;
  }

  render() {
    return (
      <div className="App">
        <div>
          <h1>Twitter</h1>
        </div>
        <div>{this.rendertweets()}</div>
      </div>
    );
  }
}

export default App;
