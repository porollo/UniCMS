import React from "react";
import {Footer} from "./components/footer";
import {Content} from "./components/content";
import PrimarySearchAppBar from "./components/header/header";

export default function App() {
    return (
        <div>
            <PrimarySearchAppBar/>
            <Content/>
            <Footer/>
        </div>
    );
}