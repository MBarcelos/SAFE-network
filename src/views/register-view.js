function start() {
    renderForm();
}

function clear() {
    $('#article-body').empty();
    $('#video-body').empty();
    $('#register-body').empty();
}

function renderForm() {
    /* eslint-disable no-param-reassign */
    
    let html = ` <div class="main">
           <div class="grid-container">
               <div class="grid-x grid-padding-x grid-margin-x">
                   <div class="cell medium-6">
                       <h2>REGISTER</h2>
                       <form action="">
                            <label for="name"> Name
                                <input type="text" name="name">
                            </label>
                            <label for="email"> Email
                                <input type="email" name="email">
                            </label>               
                            <label for="phone"> Phone Number
                                <input type="text" name="phone">
                            </label>               
                            <label for="location"> Location
                                <select>
                                    <option value="husker">Porto</option>
                                    <option value="starbuck">Fundão</option>
                                    <option value="hotdog">Coimbra</option>
                                    <option value="apollo">Lisboa</option>
                                </select>
                            </label>      
                            <a href="#" class="read-more">REGISTER</a>         
                        </form>
                   </div>
                   <div class="cell large-6">
                        <h2>LOGIN</h2>
                        <form action="">
                             <label for="email"> Email
                                 <input type="email" name="email">
                             </label>
                             <label for="password"> Password
                                 <input type="password" name="password">
                             </label>
                             <a href="#" class="read-more"> LOGIN </a>
                         </form> 
                   </div>
                </div>
           </div>
    </div> `

    $("#register-body").append(html);

}

export default {
    start,
    clear
};
