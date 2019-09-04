import React from 'react';

class IndexComponent extends React.Component {

    constructor(props) {
        super(props);
        this.state = {date: new Date()};
    }

    componentDidMount() {

    }

    componentWillUnmount() {

    }

    render() {
        return <h1>Today is: {this.state.date.toLocaleTimeString()}</h1>;
    }
}

export default IndexComponent;