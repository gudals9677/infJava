const person = {
  name: 'John',
  address: {
    line1: '123 Main St',
    city: 'Springfield',
    country: 'USA',
  },
  profiles: ['twitter', 'facebook', 'instagram'],
  printProfile: () => {
    person.profiles.map(
      profile => console.log(profile)
    )
  }
};

export default function LearningJs() {
  return (
    <>
      <div>{person.name}</div>
      <div>{person.address.line1}</div>
      <div>{person.profiles[1]}</div>
      <div>{ person.printProfile() }</div>
    </>
  );
}